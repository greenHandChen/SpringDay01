package club.osai;

/**
 * @Author: Chen Quan
 * @GitHub: https://github.com/chenquan
 * @Email: chenquan@osai.club
 * @Class: HelloSpringBoot.java
 * @Version: 1.0
 * @Date: 2019/7/23
 * @Description:
 */

public class HelloSpringBoot {
    private String words;

    public String getWords() {
        return words;
    }

    public void setWords(String words) {
        this.words = words;
    }

    public String sayHello() {
        String str = "Hello " + words;
        System.out.println(str);
        return str;
    }

    @Override
    public String toString() {
        return "HelloSpringBoot{" +
                "words='" + words + '\'' +
                '}';
    }
}
