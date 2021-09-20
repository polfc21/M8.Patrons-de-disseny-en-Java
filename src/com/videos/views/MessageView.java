package com.videos.views;

public enum MessageView {

    CREATE_USER("Crear un usuari"),
    CHANGE_USER_MENU("Menú d'usuaris"),
    READ_NAME("Escriu el nom de l'usuari: "),
    READ_SURNAME("Escriu els cognoms de l'usuari: "),
    READ_PASSWORD("Escriu la contrasenya de l'usuari: "),
    CHOOSE_USER("Triar un usuari"),
    CHOOSE_ID_USER("Escriu l'id de l'usuari que vols triar: "),
    CHOOSE_VIDEO("Triar vídeo"),
    CHOOSE_URL_VIDEO("Escriu l'url del vídeo que vols triar: "),
    PLAYER_VIDEO("Reproductor del vídeo triat"),
    PLAY_VIDEO("Reproduir el vídeo"),
    PAUSE_VIDEO("Pausar el vídeo"),
    STOP_VIDEO("Parar el vídeo"),
    SEE_VIDEOS("Veure els vídeos de l'usuari triat"),
    SEE_PLAYER("Veure l'estat del reproductor"),
    CREATE_VIDEO("Crear un vídeo"),
    READ_URL("Escriu la url del vídeo: "),
    READ_TITLE("Escriu el títol del vídeo: "),
    READ_TAG("Escriu els tags del vídeo (separats amb un espai): "),
    READ_DURATION("Escriu la durada del vídeo (en segons): "),
    EXIT_PLAYER("Sortir del reproductor"),
    EXIT_USER_MENU("Sortir del menú d'usuaris"),
    EXIT("Sortir de l'aplicació");

    private String message;

    MessageView(String message) {
        this.message = message;
    }

    public String getMessage() {
        return this.message;
    }

}
