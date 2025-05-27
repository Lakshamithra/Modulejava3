interface Playable {
    void play();
}

class Guitar implements Playable {
    @Override
    public void play() {
        System.out.println("Playing the guitar");
    }
}

class Piano implements Playable {
    @Override
    public void play() {
        System.out.println("Playing the piano");
    }
}

public class MusicTest {
    public static void main(String[] args) {
        Playable myGuitar = new Guitar();
        myGuitar.play();

        Playable myPiano = new Piano();
        myPiano.play();
    }
}
