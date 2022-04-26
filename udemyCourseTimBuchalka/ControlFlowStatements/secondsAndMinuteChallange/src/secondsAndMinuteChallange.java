public class secondsAndMinuteChallange {
    public static String getDurationString(int secconds, int minutes){
        if (minutes >= 0 && (secconds >= 0 && secconds <= 59)){
            int hour = (minutes / 60);/*int wyciąga liczbę całkowitą zaokrąglając w dół*/
            minutes %= 60;/*reszta z powyższego dzielenia*/
//            secconds %= 60;/*to nie jest potrzebne - nie uwzględniamy tego w obliczeniach*/
            return hour + " HH " + minutes + " MM " + secconds + " SS";
        }
        return "Invalid Value";
    }
    public static String getDurationString(int secconds){
        if (secconds >= 0) {
            int minutesInSecconds = secconds / 60;
            int remainingSec = secconds % 60;
            return getDurationString(remainingSec, minutesInSecconds);
        }
        return "Invalid Value";
    }
}
