package huanglehao.study.entendmessageservice.mapper;

import huanglehao.study.pojomodul.entity.Entend;

import java.util.List;

/**
 * @Author: huanglehao
 * @Description:
 * @Date: Create in 14:08 2019/7/26
 */
public interface EntendMapper {
    public void addEntend(Entend entend);

    //删除一个额外信息
    public void deleteById(int id);

    //修改
    public void updateEntend(Entend entend);

    //查询所有的额外信息
    public List<Entend> selectEntendList();
}
