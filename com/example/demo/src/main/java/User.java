/**
 * Created by yuho on 2018/02/01.
 */
public class User {
    private String name=null;
    private String email=null;
    public Integer age=null;

    public User(String name, String email){
        this.name= name;
        this.email = email;
    }

    public boolean Validate(){
        if(this.name==null || this.email==null){
            return false;
        }
        return true;
    }

    public String ageCat(){
        if(age < 20){
            return "未成年";
        }
        return "成人";
    }
}
