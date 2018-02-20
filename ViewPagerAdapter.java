#if (${PACKAGE_NAME} && ${PACKAGE_NAME} != "")package ${PACKAGE_NAME} ;#end

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import java.util.List;

#parse("File Header.java")
public class ${ADAPTER_NAME} extends FragmentPagerAdapter{

    List<${ITEM_POJO_CLASS}> mlist;

    public ${ADAPTER_NAME}(FragmentManager fm, List<${ITEM_POJO_CLASS}> mlist)
    {
        super(fm);
        this.mlist=mlist;
    }

    @Override
    public Fragment getItem(int position) {
        
        ${ITEM_POJO_CLASS} item=mlist.get(position);
        ${FRAGEMENT_CLASS} fragment=new ${Fragment_Class}();
        fragment.setArguments(getBundle(item));
        return fragment;
    }

    private Bundle getBundle(${ITEM_POJO_CLASS} item)
    {
        Bundle bundle=new Bundle();
        //put data in bundle to pass it to fragments
        return bundle;
    }

    @Override
    public int getCount()
    {
        return mlist.size();
    }
}
