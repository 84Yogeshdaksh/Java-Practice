// interface bank{
//     float show();
// }

// class SBI implements bank{
//     public float show(){
//         return 23.3f;
//     }
// }

// class PNB implements bank{
//     public float show(){
//         return 12.3f;
//     }
// }

// class BOB implements bank{
//     public float show(){
//         return 12.5f;
//     }
// }

// public class practice01{
//     public static void main(String[] args) {
//         bank obj = new BOB();
//         System.out.println("ROI: "+obj.show());

//         bank obj1 = new SBI();
//         System.out.println("ROI: "+obj1.show());
//     }
// }


interface marks{
    int showmarks();
}

class Yogesh implements marks{
    public int showmarks(){
        return 1004;
    }
}

class Priyankul implements marks{
    public int showmarks(){
        return 995;
    }
}

public class practice01{
    public static void main(String[] args) {
        marks obj = new Yogesh();
        System.out.println("marks: "+obj.showmarks());
    }
}