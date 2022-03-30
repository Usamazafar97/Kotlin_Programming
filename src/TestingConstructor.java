public class TestingConstructor {

    int a;

    TestingConstructor(int a) {
        this.a = a;

        try {
            method(10);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }


    int method(int a) throws Exception {

        if (a == 10)
            return 20;
        else
            throw new Exception("");
    }
}


   /* @Throws(java.lang.Exception::class)
    fun printString(string: String){
//    println(string)

        if (string == "" || string == null)


            when (string) {
            "testing" -> {
                return
            }
            "testng_two" -> {
            }
        }
        throw java.lang.RuntimeException()
    }*/