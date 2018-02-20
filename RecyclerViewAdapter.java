#if (${PACKAGE_NAME} && ${PACKAGE_NAME} != "")package ${PACKAGE_NAME} ;#end

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import java.util.List;

#parse("File Header.java")
public class ${ADAPTER_NAME} extends RecyclerView.Adapter<${ADAPTER_NAME}.${VIEWHOLDER_CLASS}> {

    LayoutInflater inflater;
    Context context;
    List<${ITEMHOLDER_CLASS}> mlist;

    public ${ADAPTER_NAME}(Context context, List<${ITEMHOLDER_CLASS}> mlist) {
        this.context = context;
        this.inflater=LayoutInflater.from(context);
        this.mlist=mlist;
    }

    @Override
    public ${VIEWHOLDER_CLASS} onCreateViewHolder(ViewGroup parent, int viewType) {
        View view= inflater.inflate(${LAYOUT_RES_ID},parent,false);
        return new ${VIEWHOLDER_CLASS}(view);
    }

    @Override
    public void onBindViewHolder(${VIEWHOLDER_CLASS} holder, int position) {
        ${ITEMHOLDER_CLASS} item=mlist.get(position);
        holder.bind(item);
    }

    @Override
    public int getItemCount() {
        return mlist.size();
    }

    class ${VIEWHOLDER_CLASS} extends RecyclerView.ViewHolder{
        public ${VIEWHOLDER_CLASS}(View itemView) {
            super(itemView);
        }

        public void bind(${ITEMHOLDER_CLASS} item)
        {
            //bind data here
        }
    }
}
