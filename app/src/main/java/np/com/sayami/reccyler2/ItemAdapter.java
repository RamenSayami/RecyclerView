package np.com.sayami.reccyler2;

import android.media.Image;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by sayami on 6/21/2016.
 */
public class ItemAdapter extends RecyclerView.Adapter<ItemAdapter.MyViewHolder> {

    List<Items> itemsList;

    public ItemAdapter(List<Items> itemsList) {
        this.itemsList = itemsList;
    }

    public class MyViewHolder extends RecyclerView.ViewHolder{
        public ImageView icon;
        public   TextView tit1;
        public   TextView des1;

        public MyViewHolder(View itemView) {
            super(itemView);

//             icon = (ImageView) itemView.findViewById(R.id.);
             tit1= (TextView) itemView.findViewById(R.id.txt1);
             des1= (TextView) itemView.findViewById(R.id.txt2);
        }
    }


    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView= LayoutInflater.from(parent.getContext()).inflate(R.layout.aru_kei_row,parent,false);

        MyViewHolder myViewHolder;
        myViewHolder = new MyViewHolder(itemView);


        return myViewHolder;
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        Items items= itemsList.get(position);
        holder.tit1.setText(items.getTitle());
        holder.des1.setText(items.getDescription());

    }

    @Override
    public int getItemCount() {
        return itemsList.size();
    }
}
