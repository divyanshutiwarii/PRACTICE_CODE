interface In1{
    final int a =10;
    void setdata();
    void getdata();

}
interface xyz extends In1{}
interface abc extends In1{}
   
class interfacae implements abc,xyz{

        public void setdata(){
        System.out.println("SET DATA CHECK");
        }

        public void getdata(){
            System.out.println(a);
        }
        public static void main(String[] args) {
            interfacae f = new interfacae();
            f.getdata();
            f.setdata();
        }
    }
