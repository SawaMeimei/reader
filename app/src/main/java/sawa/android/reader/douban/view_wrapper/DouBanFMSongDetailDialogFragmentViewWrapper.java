package sawa.android.reader.douban.view_wrapper;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import sawa.android.reader.R;
import sawa.android.reader.common.BaseViewWrapper;
import sawa.android.reader.common.PlusImageView;

/**
 * Created by mc100 on 2017/4/12.
 */

public class DouBanFMSongDetailDialogFragmentViewWrapper extends BaseViewWrapper {

    public DouBanFMSongDetailDialogFragmentViewWrapper(View rootView) {
        super(rootView);
    }

    public PlusImageView coverImageView() {
        return (PlusImageView) rootView().findViewById(R.id.pv_cover);
    }

    public TextView titleTextView() {
        return (TextView) rootView().findViewById(R.id.tv_title);
    }

    public TextView creatorNameTextView() {
        return (TextView) rootView().findViewById(R.id.tv_creator);
    }

    public ImageView starImageView() {
        return (ImageView) rootView().findViewById(R.id.iv_star);
    }

    public ImageView downloadImageView() {
        return (ImageView) rootView().findViewById(R.id.iv_download);
    }

    public ImageView playImageView() {
        return (ImageView) rootView().findViewById(R.id.iv_play);
    }

    public ImageView shareImageView() {
        return (ImageView) rootView().findViewById(R.id.iv_share);
    }

    public TextView cancelTextView() {
        return (TextView) rootView().findViewById(R.id.tv_cancel);
    }

}
