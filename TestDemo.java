package secondproject;

class Emp{
    private int empno ; //雇员编号
    private String ename ; //雇员姓名
    private String job ;   //雇员职位
    private double sal ;   //雇员薪资
    public Emp(){  //定义一个无参构造方法
    }
    public Emp(int eno, String ena, String j, double s){   //有参构造
        empno = eno;                                  //为属性赋值
        ename = ena;                                  //为属性赋值
        job = j;                                      //为属性赋值
        sal = s;                                      //为属性赋值
    }
    public void setEmpno(int e){                    //设置empno属性
        empno = e;
    }

    public void setEname(String e){                 //设置ename属性
        ename = e;
    }
    public void setJob(String j){                   //设置job 属性
        job = j;
    }
    public void setSal(double s){                   //设置sal属性
        sal = s;
    }
    public int getEmpno(){                          //取得empno 内容
        return empno;
    }
    public String getEname(){                       //取得ename内容
        return ename;
    }
    public String getJob(){                         //取得job 内容
        return job;
    }
    public  double getSal(){                        //取得sal内容
        return sal;
    }
    public String getInfo(){
        return "雇员编号：" + empno + "\n" +
                "雇员姓名：" +  ename + "\n" +
                "雇员职位：" + job + "\n" +
                "雇员工资：" + sal;
    }
}

public class TestDemo{
    public static void main(String args[]){
        Emp e = new Emp(7369,"XXX","CEO",2000000.0);
        System.out.println(e.getInfo());
    }
}