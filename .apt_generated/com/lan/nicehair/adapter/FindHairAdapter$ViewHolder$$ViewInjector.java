// Generated code from Butter Knife. Do not modify!
package com.lan.nicehair.adapter;

import android.view.View;
import butterknife.ButterKnife.Finder;

public class FindHairAdapter$ViewHolder$$ViewInjector {
  public static void inject(Finder finder, final com.lan.nicehair.adapter.FindHairAdapter.ViewHolder target, Object source) {
    View view;
    view = finder.findById(source, 2131165526);
    if (view == null) {
      throw new IllegalStateException("Required view with id '2131165526' for field 'poster_commentNumTv' was not found. If this view is optional add '@Optional' annotation.");
    }
    target.poster_commentNumTv = (android.widget.TextView) view;
    view = finder.findById(source, 2131165522);
    if (view == null) {
      throw new IllegalStateException("Required view with id '2131165522' for field 'poster_scanNumTv' was not found. If this view is optional add '@Optional' annotation.");
    }
    target.poster_scanNumTv = (android.widget.TextView) view;
    view = finder.findById(source, 2131165524);
    if (view == null) {
      throw new IllegalStateException("Required view with id '2131165524' for field 'poster_praiseNumTv' was not found. If this view is optional add '@Optional' annotation.");
    }
    target.poster_praiseNumTv = (android.widget.TextView) view;
    view = finder.findById(source, 2131165527);
    if (view == null) {
      throw new IllegalStateException("Required view with id '2131165527' for field 'poster_nameTv' was not found. If this view is optional add '@Optional' annotation.");
    }
    target.poster_nameTv = (android.widget.TextView) view;
    view = finder.findById(source, 2131165519);
    if (view == null) {
      throw new IllegalStateException("Required view with id '2131165519' for field 'imageView' was not found. If this view is optional add '@Optional' annotation.");
    }
    target.imageView = (android.widget.ImageView) view;
  }

  public static void reset(com.lan.nicehair.adapter.FindHairAdapter.ViewHolder target) {
    target.poster_commentNumTv = null;
    target.poster_scanNumTv = null;
    target.poster_praiseNumTv = null;
    target.poster_nameTv = null;
    target.imageView = null;
  }
}
