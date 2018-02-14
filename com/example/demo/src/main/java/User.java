/**
 * Created by yuho on 2018/02/01.
 * TODO: プロパティ追加
 */
public class User {
    private String firstName=null;
    private String lastName=null;
    private String email=null;
    public Integer age;


    public User(String fname, String lname, String email){
        this.firstName= fname;
        this.lastName= lname;
        this.email = email;
    }

    // TODO: 年齢チェック
    // TODO: メールアドレスのバリデーション
    public boolean Validate(){
        if(this.name()==null || this.email==null){
            return false;
        }
        return true;
    }

    public String name (){
        return firstName + lastName;
    }

    public String ageCat(){
        if(age < 20){
            return "未成年";
        }
        return "成人";
    }
}
