// Generated code from Butter Knife. Do not modify!
package com.example.junhee.ohmygirl_mvp_java.main;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import com.example.junhee.ohmygirl_mvp_java.R;
import java.lang.IllegalStateException;
import java.lang.Override;

public class MainFragment_ViewBinding implements Unbinder {
  private MainFragment target;

  private View view2131165222;

  private View view2131165221;

  private View view2131165219;

  private View view2131165220;

  @UiThread
  public MainFragment_ViewBinding(final MainFragment target, View source) {
    this.target = target;

    View view;
    view = Utils.findRequiredView(source, R.id.btnShowHi, "field 'btnShowHi' and method 'showHi'");
    target.btnShowHi = Utils.castView(view, R.id.btnShowHi, "field 'btnShowHi'", Button.class);
    view2131165222 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.showHi();
      }
    });
    view = Utils.findRequiredView(source, R.id.btnShowBye, "field 'btnShowBye' and method 'showBye'");
    target.btnShowBye = Utils.castView(view, R.id.btnShowBye, "field 'btnShowBye'", Button.class);
    view2131165221 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.showBye();
      }
    });
    view = Utils.findRequiredView(source, R.id.btnGo, "field 'btnGo' and method 'goAnotherFragment'");
    target.btnGo = Utils.castView(view, R.id.btnGo, "field 'btnGo'", Button.class);
    view2131165219 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.goAnotherFragment();
      }
    });
    view = Utils.findRequiredView(source, R.id.btnRx, "field 'btnRx' and method 'startRx'");
    target.btnRx = Utils.castView(view, R.id.btnRx, "field 'btnRx'", Button.class);
    view2131165220 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.startRx();
      }
    });
    target.tv = Utils.findRequiredViewAsType(source, R.id.tv, "field 'tv'", TextView.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    MainFragment target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.btnShowHi = null;
    target.btnShowBye = null;
    target.btnGo = null;
    target.btnRx = null;
    target.tv = null;

    view2131165222.setOnClickListener(null);
    view2131165222 = null;
    view2131165221.setOnClickListener(null);
    view2131165221 = null;
    view2131165219.setOnClickListener(null);
    view2131165219 = null;
    view2131165220.setOnClickListener(null);
    view2131165220 = null;
  }
}
