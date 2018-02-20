# Android-Templates

<h2>How To Use Templates</h2>

<ul>
<li>To use any template for android studio, download the template.java file and copy it to <b>Android Studio>config>fileTemplates</b>.</li>
<li>Open android studio, Right click on app folder and go to New. The template will show up there.</li>
<li>Select the template and it will ask for perameters required in template. fill up perameters and click okay.</li>
<li>Voila! template code is imported to your project.</li>
</ul>

<h2>RecyclerViewAdapter.java</h2>

It is simple template for creating Adapter and ViewHolder for RecyclerView in just few seconds. Following perameters are required to use the template.

<ul>
<li><b>ADAPTER_NAME:</b> Name of the adapter that will be created. You can give any valid java class name to it.</li>
<li><b>VIEWHOLDER_CLASS:</b> Class name for the ViewHolder class required by the RecyclerView Adapter class.</li>
<li><b>ITEMHOLDER_CLASS:</b> Class name of the POJO object that holds the data for elements of single row of RecyclerView.</li>
<li><b>LAYOUT_RES_ID</b>: It is a valid layout resource ID that is used to inflate single row of RecyclerView.</li>
</ul>


<h2>ViewPagerAdapter.java</h2>

This is the template for ViewPager with fragments. This template can be used in situations like when every page of your ViewPager contains same data fields so it can be represented by a single fragment by changing values for views like RecyclerView Items. Following perameters are required to use the template.

<ul>
  <li><b>ADAPTER_NAME:</b> Name of the adapter that will be created. You can give any valid java class name to it.</li>
  <li><b>ITEM_POJO_CLASS:</b> Class name of the POJO object that holds the data for elements of fragments in ViewPager.</li>
  <li><b>FRAGEMENT_CLASS:</b> Fragment class name that will be loaded in each page of ViewPager.</li>
</ul>
