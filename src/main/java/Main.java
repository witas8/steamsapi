import Mapping.ExampleMap4;
import Mapping.ExampleMaps1;
import Mapping.ExampleMaps2;
import Essential.ExampleComp2;
import Essential.ExampleComp3;
import Essential.ExampleComp4;
import Essential.ExampleWhileDrop9;


public class Main {
    public static void main(String[] args) {

        ExampleMaps1 em1 = new ExampleMaps1();
        em1.run();

        ExampleMaps2 em2 = new ExampleMaps2();
        em2.run();

        ExampleMap4 em4 = new ExampleMap4();
        em4.run();

        ExampleComp2 ec2 = new ExampleComp2();
        ec2.run();

        ExampleComp3 ec3 = new ExampleComp3();
        ec3.run();

        ExampleComp4 ec4 = new ExampleComp4();
        ec4.run();

        ExampleWhileDrop9 ewd9 = new ExampleWhileDrop9();
        ewd9.run();

    }
}
