public class Employee {
     private String id; // 把全部变量定义为私有变量
        // 因为，这样更安全，也可以定义为公用的，受保护的。取名要见名之意
        private String name;
        private double salary;




    public Employee() {
    }


    public Employee(String id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    // 获取成员信息
        public String getId() {
            return id;
        }
        public String getName() {
            return name;
        }
        public double getSalary() {
            return salary;
        }

        // 修改成员信息
        public void setId(String id) {
            this.id = id;
        }
        public void setName(String name) {
            this.name = name;
        }
        public void setSalary(double salary) {
            this.salary = salary;
        }

        // 打印成员信息
        @Override
        public String toString() {
            return id + "\t" + name + "\t" + salary;

        }
    }

