# Android-Templates

#How To Use Templates

<ul>
<li>To use any template for android studio, download the template.java file and copy it to <b>Android Studio>config>fileTemplates</b>.</li>
<li>Open android studio, Right click on app folder and go to New. The template will show up there.</li>
<li>Select the template and it will ask for perameters required in template. fill up perameters and click okay.</li>
<li>Voila! template code is imported to your project.</li>
</ul>

#RecyclerViewAdapter.java

It is simple template for creating Adapter and ViewHolder for RecyclerView in just few seconds. Following perameters are required to use the template.

-> <b>PACKAGE_NAME:</b> Full package name under which the file will be created. It will be configured automatically.
-> <b>ADAPTER_NAME:</b> Name of the adapter that will be created. You can give any valid java class name to it.
-> <b>VIEWHOLDER_CLASS:</b> Class name for the ViewHolder class required by the RecyclerView Adapter class.
-> <b>ITEMHOLDER_CLASS:</b> Class name of the POJO object that holds the data for elements of single row of RecyclerView.
-> <b>LAYOUT_RES_ID</b>: It is a valid layout resource ID that is used to inflate single row of RecyclerView.
