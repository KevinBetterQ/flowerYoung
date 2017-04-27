// Generated code from Butter Knife. Do not modify!
package com.lan.nicehair.adapter;

import android.view.View;
import butterknife.ButterKnife.Finder;

public class HairCommentAdapter$ViewHolder$$ViewInjector {
  public static void inject(Finder finder, final com.lan.nicehair.adapter.HairCommentAdapter.ViewHolder target, Object source) {
    View view;
    view = finder.findById(source, 2131165332);
    if (view == null) {
      throw new IllegalStateException("Required view with id '2131165332' for field 'mScanIv' was not found. If this view is optional add '@Optional' annotation.");
    }
    target.mScanIv = (android.widget.ImageView) view;
    view = finder.findById(source, 2131165337);
    if (view == null) {
      throw new IllegalStateException("Required view with id '2131165337' for field 'mNoRightTv' was not found. If this view is optional add '@Optional' annotation.");
    }
    target.mNoRightTv = (android.widget.TextView) view;
    view = finder.findById(source, 2131165335);
    if (view == null) {
      throw new IllegalStateException("Required view with id '2131165335' for field 'mLayout' was not found. If this view is optional add '@Optional' annotation.");
    }
    target.mLayout = (android.widget.LinearLayout) view;
    view = finder.findById(source, 2131165334);
    if (view == null) {
      throw new IllegalStateException("Required view with id '2131165334' for field 'mSendIv' was not found. If this view is optional add '@Optional' annotation.");
    }
    target.mSendIv = (android.widget.ImageView) view;
    view = finder.findById(source, 2131165338);
    if (view == null) {
      throw new IllegalStateException("Required view with id '2131165338' for field 'mLayoutMore' was not found. If this view is optional add '@Optional' annotation.");
    }
    target.mLayoutMore = (android.widget.LinearLayout) view;
    view = finder.findById(source, 2131165339);
    if (view == null) {
      throw new IllegalStateException("Required view with id '2131165339' for field 'mMoreTv' was not found. If this view is optional add '@Optional' annotation.");
    }
    target.mMoreTv = (android.widget.TextView) view;
    view = finder.findById(source, 2131165331);
    if (view == null) {
      throw new IllegalStateException("Required view with id '2131165331' for field 'mContentTv' was not found. If this view is optional add '@Optional' annotation.");
    }
    target.mContentTv = (android.widget.TextView) view;
    view = finder.findById(source, 2131165330);
    if (view == null) {
      throw new IllegalStateException("Required view with id '2131165330' for field 'mHeadIv' was not found. If this view is optional add '@Optional' annotation.");
    }
    target.mHeadIv = (com.lan.nicehair.common.CircleImageView) view;
    view = finder.findById(source, 2131165333);
    if (view == null) {
      throw new IllegalStateException("Required view with id '2131165333' for field 'mTimeTv' was not found. If this view is optional add '@Optional' annotation.");
    }
    target.mTimeTv = (android.widget.TextView) view;
    view = finder.findById(source, 2131165336);
    if (view == null) {
      throw new IllegalStateException("Required view with id '2131165336' for field 'mRightTv' was not found. If this view is optional add '@Optional' annotation.");
    }
    target.mRightTv = (android.widget.TextView) view;
  }

  public static void reset(com.lan.nicehair.adapter.HairCommentAdapter.ViewHolder target) {
    target.mScanIv = null;
    target.mNoRightTv = null;
    target.mLayout = null;
    target.mSendIv = null;
    target.mLayoutMore = null;
    target.mMoreTv = null;
    target.mContentTv = null;
    target.mHeadIv = null;
    target.mTimeTv = null;
    target.mRightTv = null;
  }
}
