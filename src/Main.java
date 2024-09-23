
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        //SRP
        System.out.println("SRP:");
User user = new User("Zhanbatyr", "zhanbatyr@gmail.com");
EmailValidator validator = new EmailValidator();

if (validator.isValid(user.gerEmail())){
    System.out.println(user.getName() + "'s email is valid.");
}
else{
    System.out.println(user.getName() + "'s email is not valid.");
}

    //ISP
        System.out.println("ISP");
        Workable humanWorker = new HumanWorker();
        Workable robotWorker = new RobotWorker();

        humanWorker.work();
        ((Eatable) humanWorker).eat();

        robotWorker.work();

    //OCP
        System.out.println("OCP:");
        Shape rectangle = new Rectangle(5, 3);
        Shape circle = new Circle(4);

        System.out.println("Rectangle area: " + rectangle.area());
        System.out.println("Circle area: " + circle.area());

        //LSP
        System.out.println("LSP:");
        Bird sparrow = new Sparrow();
        ((Flyable) sparrow).fly();

        Bird penguin = new Penguin();
        penguin.eat();

        //DIP
        Switchable light = new Light();
//        Button button = new Button(light);

//        button.press();
        }
    }


