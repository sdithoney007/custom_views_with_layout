package honey.com.flippingcard;

import android.content.Context;
import android.support.v7.widget.CardView;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.RelativeLayout;

public class FlippingCard extends RelativeLayout implements View.OnClickListener{

    private CardView mCard2;
    private CardView mCard1;

    public FlippingCard(Context context) {
        super(context);
        init();
    }

    public FlippingCard(Context context, AttributeSet attrs) {
        super(context, attrs);
        init();

    }

    public FlippingCard(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init();

    }

    private void init() {
        setOnClickListener(this);

        LayoutInflater inflator = (LayoutInflater) getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        inflator.inflate(R.layout.view_flip_card, this, true);
    }

    @Override
    protected void onFinishInflate() {
        super.onFinishInflate();
        initView();
    }

    private void initView() {

        mCard2 = findViewById(R.id.card2);
        mCard1 = findViewById(R.id.card1);
    }

    private void toogleCards(){

        if(mCard1.getVisibility()==VISIBLE){
            mCard1.setVisibility(GONE);
            mCard2.setVisibility(VISIBLE);

        } else{
            mCard1.setVisibility(VISIBLE);
            mCard2.setVisibility(GONE);
        }
    }

    @Override
    public void onClick(View v) {
        toogleCards();
    }
}
