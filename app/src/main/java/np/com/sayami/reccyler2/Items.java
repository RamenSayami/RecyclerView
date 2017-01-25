package np.com.sayami.reccyler2;

/**
 * Created by sayami on 6/21/2016.
 */
public class Items {
    private String title, description;

    public Items(String tit, String tat){
        this.title=tit;
        this.description=tat;

    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
