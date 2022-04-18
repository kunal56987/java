class student {
    private int roll;
    private String name;
    public int getRoll(){
        return roll;
    }
    public void setRoll(int roll){
        this.roll=roll;
    }
    public String getname(){
        return name;
    }
    public void setname(String name){
        this.name=name;
    }
    public void display(){
        System.out.println("Roll no:"+roll);
        System.out.println("name:"+name);
    }
}
