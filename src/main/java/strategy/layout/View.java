package strategy.layout;

public class View {
    private Layout layout;

    public View() {
        init();
    }

    public void init(){
        setLayout(R.RELATIVE_LAYOUT);
    }

    public void setLayout(Layout layout) {
        this.layout = layout;
    }

    void showInfo(){
        System.out.println("using layout is: " + layout);
    }

    public static void main(String[] args) {
        View view = new View();
        view.showInfo();
    }

}
