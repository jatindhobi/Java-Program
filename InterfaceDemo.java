interface MusicPlayer {
    void play();
    void pause();
    void next();
}

class Spotify implements MusicPlayer {
    public void play() {
        System.out.println("Spotify : Play Music");
    }

    public void pause() {
        System.out.println("Spotify : Pause Music");
    }

    public void next() {
        System.out.println("Spotify : Play Next Music");
    }

    public void create_playlist() {
        System.out.println("Spotify : Create Playlist");
    }

    public void subscription() {
        System.out.println("Spotify : Purchase Subscription");
    }
}

class Gaana implements MusicPlayer {
    public void play() {
        System.out.println("Gaana : Play Music");
    }

    public void pause() {
        System.out.println("Gaana : Pause Music");
    }

    public void next() {
        System.out.println("Gaana : Play Next Music");
    }

    public void shuffle() {
        System.out.println("Gaana : Shuffle Music");
    }    

    public void repeat() {
        System.out.println("Gaana : Repeat Music");
    }
}

public class InterfaceDemo{
    public static void main(String[]args){
        MusicPlayer spot=new Spotify();
        spot.play();
        spot.pause();
        spot.next();
        Spotify sp=new Spotify();
        sp.create_playlist();
        sp.subscription();

        MusicPlayer gaana=new Gaana();
        gaana.play();
        gaana.pause();
        gaana.next();
        
        Gaana mp=new Gaana();
        mp.shuffle();
        mp.repeat();

    }
}