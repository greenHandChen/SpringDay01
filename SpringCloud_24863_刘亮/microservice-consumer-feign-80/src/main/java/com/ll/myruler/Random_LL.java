package com.ll.myruler;

import com.netflix.client.config.IClientConfig;
import com.netflix.loadbalancer.AbstractLoadBalancerRule;
import com.netflix.loadbalancer.ILoadBalancer;
import com.netflix.loadbalancer.Server;

import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

/**
 * @package com.ll.myruler
 * @Author LL
 * @ClassName RoundRule_LL
 * @Date 2019/7/25  15:01
 */
public class Random_LL extends AbstractLoadBalancerRule  {

    //total = 0 //当total==5以后，我们的指针再往下走
    //index = 0 //当前被调用的服务的服务器地址
    //total需要重新置为0，但是已经达到过一个5次，index置为1
    //分析；我们5次，但是微服务只有8001，8002，8003三台

    private int total = 0;  //当前机器总共被调用的次数，目前要求每台机器被调用5次
    private int currentIndex = 0;   //当前提供服务的机器号

    public Server choose(ILoadBalancer lb, Object key){
        if(lb == null){
            return null;
        }
        Server server = null;
        while(server == null){
            if(Thread.interrupted()){
                return null;
            }
            List<Server> upList = lb.getReachableServers();
            List<Server> allList = lb.getAllServers();

            int serverCount = allList.size();
            if(serverCount == 0){
                return null;
            }

            if(total < 5){
                server = upList.get(currentIndex);
                total++;
            }else{
                total = 0;
                currentIndex ++;
                if(currentIndex >= upList.size()){
                    currentIndex = 0;
                }
            }
            if(server == null ){
                Thread.yield();
                continue;
            }

            if (server.isAlive()){
                return (server);
            }

            server = null;
            Thread.yield();
        }
        return server;
    }

    protected int chooseRandomInt(int serverCount){
        return ThreadLocalRandom.current().nextInt(serverCount);
    }

    public Server choose(Object key){
        return choose(getLoadBalancer(),key);
    }


    @Override
    public void initWithNiwsConfig(IClientConfig clientConfig) {

    }
}