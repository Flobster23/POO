class SeriesApp {
    public static void main(String[] args) {
        Series[] series = new Series[2];
        series[0] = new MaisDois();
        series[1] = new MaisTres();
        executa(series);
    }

    public static void executa(Series[] series) {
        for(Series s : series){
            s.setStart(1);
            int n = 5;
            while(n > 0){
                System.out.println(s.getNext());
                n--;
            }
            s.reset();
        }

    }
}

