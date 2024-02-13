package lesson_21.code.lessoncode.music;

public class MusicianDemo {
    public static void main(String[] args) {
        RockMusician musician = new RockMusician();
        Singer singer = new RockMusician();
        Dancer dancer = new RockMusician();


        musician.dance();
        musician.sing();
        musician.greeting();

//        singer.sing();
//        singer.dance();
//
//        dancer.dance();
//        dancer.sing();


        Singer[] singers = {
                new RockMusician(),
                new PopMusician(),
                new RockMusician(),
                new PopMusician(),
                new RockMusician(),
                new PopMusician(),
                new RockMusician(),
                new FolkSing()
        };

        Dancer[] dancers = {
                new RockMusician(),
                new PopMusician(),
                new RockMusician(),
                new PopMusician(),
                new RockMusician(),
                new PopMusician(),
                new RockMusician()
        };


        System.out.println("==============");

      MusicianService service = new MusicianService();

      service.singAll(singers);
      service.danceAll(dancers);

        System.out.println("===============");

        Musician[] musicians = {new PopMusician(), new RockMusician(), new PopMusician()};

        service.singAll(musicians);

    }

}
