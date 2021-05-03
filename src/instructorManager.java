public class instructorManager {

    public void login(Instructor instructor){

        System.out.println(instructor.getName()+" kullanici adıyla giriş yapti"+"/  giris yaptigi kurs : "+ instructor.getAge());

    }
    public void logout(Instructor instructor){

        System.out.println(instructor.getName()+" kullanıcı adıyla çıkış yaptı" + "/  cıkıs yaptigi kurs : "+instructor.getAge());
    }

}
