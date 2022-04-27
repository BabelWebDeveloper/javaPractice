public class Button {
    private String title;
    private onClickListener onClickListener;

    public Button(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setOnClickListener(onClickListener onClickListener) {
        this.onClickListener = onClickListener;
    }

    public void onClick() {
        this.onClickListener.onClick(this.title);//assigning object to the button, access to it by interface
    }

    public interface onClickListener {
        public void onClick(String title);
    }
}
