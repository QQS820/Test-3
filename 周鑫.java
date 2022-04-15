public class Test2 {
    final static int N = 10;
    static Linkman[] book = new Linkman[N];
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        input();
        menu();
    }

    public static void menu() {
        System.out.println("-------------------------------------"+"\n请选择：\n1:查询\n2:插入\n3:修改\n4:删除\n0:退出\n"+"-------------------------------------");
        int n = scanner.nextInt();
        for(;;){
            if(n == 0){
                System.out.println("已退出！");
                break;
            }
            switch(n){
                case 1:
                    search();
                    break;
                case 2:
                    insert();
                    print();
                    break;
                case 3:
                    update();
                    print();
                    break;
                case 4:
                    delete();
                    print();
                    break;
            }
            System.out.println("-------------------------------------"+"\n请选择：\n1:查询\n2:插入\n3:修改\n4:删除\n0:退出\n"+"-------------------------------------");
            n=scanner.nextInt();
        }
    }

    public static void input(){
        for(int i = 0;i < book.length;i++)
            book[i] = new Linkman();
        System.out.print("请输入通讯录人数：:");
        int n=scanner.nextInt();
        System.out.println("编号 姓名 性别 电话 地址");
        for(int i = 0;i < n;i++){
            int num = scanner.nextInt();
            String name = scanner.next();
            String sex = scanner.next();
            int telephone = scanner.nextInt();
            String add=scanner.next();
            book[i] = new Linkman(num,name,sex,telephone,add);
        }
    }

    public static void print(){
        System.out.println("-------------------------------------");
        System.out.println("编号\t姓名\t性别\t电话\t地址");
        for(int i=0;i < book.length;i++){
            if(book[i].num != -1){
                System.out.println(book[i].num+"\t"+book[i].name+"\t"+book[i].sex+"\t"+book[i].telephone+"\t"+book[i].address);
            }
        }
        System.out.println("-------------------------------------");
    }

    public static void search(){
        System.out.println("需要查询的编号:");
        int num = scanner.nextInt();
        System.out.println("-------------------------------------");
        System.out.println("查询结果");
        for(int i = 0;i < book.length;i++){
            if(book[i].num == num){
                System.out.println("编号\t姓名\t性别\t电话\t地址");
                System.out.println(book[i].num+"\t"+book[i].name+"\t"+book[i].sex+"\t"+book[i].telephone+"\t"+book[i].address);

                System.out.println("-------------------------------------");
                System.out.println();
                return;
            }
        }
        System.out.println("查无此人");
        System.out.println("-------------------------------------");
    }

    public static void insert(){
        for(int i = 0;i < book.length;i++){
            if(book[i].num == -1){
                System.out.println("编号 姓名 性别 电话 地址");
                int num = scanner.nextInt();
                String nam = scanner.next();
                String sex = scanner.next();
                int telephone = scanner.nextInt();
                String add = scanner.next();
                book[i] = new Linkman(num, nam, sex, telephone, add);
                return;
            }
        }
        System.out.println("存储已满，无法添加");
    }

    public static void delete(){
        System.out.println("输入要删除的编号:");
        int num=scanner.nextInt();
        for(int i = 0;i < book.length;i++){
            if(book[i].num == num){
                book[i].num=-1;
                book[i]=new Linkman();
                return;
            }
        }
        System.out.println("查无此人");
    }

    public static void update() {
        System.out.println("输入要修改的编号:");
        int num = scanner.nextInt();
        for(int i = 0;i < book.length;i++){
            if(book[i].num == num){
                System.out.println("编号 姓名 性别 电话 地址");
                num = scanner.nextInt();
                String nam=scanner.next();
                String sex=scanner.next();
                int telephone=scanner.nextInt();
                String add=scanner.next();
                book[i] = new Linkman(num, nam, sex, telephone, add);
                return;
            }
        }
        System.out.println("查无此人!");
    }
}

