package com.example.cineview20;

import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.DataBinderMapper;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.example.cineview20.databinding.ActivityMainBindingImpl;
import com.example.cineview20.databinding.ActivityYoutubeBindingImpl;
import com.example.cineview20.databinding.FragmentMainFragmentDetallesBindingImpl;
import com.example.cineview20.databinding.FragmentMainFragmentsEstrenosBindingImpl;
import java.lang.IllegalArgumentException;
import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.RuntimeException;
import java.lang.String;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class DataBinderMapperImpl extends DataBinderMapper {
  private static final int LAYOUT_ACTIVITYMAIN = 1;

  private static final int LAYOUT_ACTIVITYYOUTUBE = 2;

  private static final int LAYOUT_FRAGMENTMAINFRAGMENTDETALLES = 3;

  private static final int LAYOUT_FRAGMENTMAINFRAGMENTSESTRENOS = 4;

  private static final SparseIntArray INTERNAL_LAYOUT_ID_LOOKUP = new SparseIntArray(4);

  static {
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.cineview20.R.layout.activity_main, LAYOUT_ACTIVITYMAIN);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.cineview20.R.layout.activity_youtube, LAYOUT_ACTIVITYYOUTUBE);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.cineview20.R.layout.fragment_main_fragment_detalles, LAYOUT_FRAGMENTMAINFRAGMENTDETALLES);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.cineview20.R.layout.fragment_main_fragments_estrenos, LAYOUT_FRAGMENTMAINFRAGMENTSESTRENOS);
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View view, int layoutId) {
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = view.getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      switch(localizedLayoutId) {
        case  LAYOUT_ACTIVITYMAIN: {
          if ("layout/activity_main_0".equals(tag)) {
            return new ActivityMainBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_main is invalid. Received: " + tag);
        }
        case  LAYOUT_ACTIVITYYOUTUBE: {
          if ("layout/activity_youtube_0".equals(tag)) {
            return new ActivityYoutubeBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_youtube is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTMAINFRAGMENTDETALLES: {
          if ("layout/fragment_main_fragment_detalles_0".equals(tag)) {
            return new FragmentMainFragmentDetallesBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_main_fragment_detalles is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTMAINFRAGMENTSESTRENOS: {
          if ("layout/fragment_main_fragments_estrenos_0".equals(tag)) {
            return new FragmentMainFragmentsEstrenosBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_main_fragments_estrenos is invalid. Received: " + tag);
        }
      }
    }
    return null;
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View[] views, int layoutId) {
    if(views == null || views.length == 0) {
      return null;
    }
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = views[0].getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      switch(localizedLayoutId) {
      }
    }
    return null;
  }

  @Override
  public int getLayoutId(String tag) {
    if (tag == null) {
      return 0;
    }
    Integer tmpVal = InnerLayoutIdLookup.sKeys.get(tag);
    return tmpVal == null ? 0 : tmpVal;
  }

  @Override
  public String convertBrIdToString(int localId) {
    String tmpVal = InnerBrLookup.sKeys.get(localId);
    return tmpVal;
  }

  @Override
  public List<DataBinderMapper> collectDependencies() {
    ArrayList<DataBinderMapper> result = new ArrayList<DataBinderMapper>(1);
    result.add(new androidx.databinding.library.baseAdapters.DataBinderMapperImpl());
    return result;
  }

  private static class InnerBrLookup {
    static final SparseArray<String> sKeys = new SparseArray<String>(2);

    static {
      sKeys.put(0, "_all");
    }
  }

  private static class InnerLayoutIdLookup {
    static final HashMap<String, Integer> sKeys = new HashMap<String, Integer>(4);

    static {
      sKeys.put("layout/activity_main_0", com.example.cineview20.R.layout.activity_main);
      sKeys.put("layout/activity_youtube_0", com.example.cineview20.R.layout.activity_youtube);
      sKeys.put("layout/fragment_main_fragment_detalles_0", com.example.cineview20.R.layout.fragment_main_fragment_detalles);
      sKeys.put("layout/fragment_main_fragments_estrenos_0", com.example.cineview20.R.layout.fragment_main_fragments_estrenos);
    }
  }
}
