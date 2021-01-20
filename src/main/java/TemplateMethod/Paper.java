package TemplateMethod;

public abstract class Paper {

    public void templateMethod(){
        questionOne();
        String s = answerOne();
        System.out.println("答案："+s);
    }

    private void questionOne(){
        System.out.println("问题1：三国的张飞是哪国人？a:魏国；b:蜀国；c:吴国");
    }

    protected abstract String answerOne();
}
