// Generated code from Butter Knife. Do not modify!
package ice.caster.android.fragment;

import android.view.View;
import butterknife.ButterKnife.Finder;
import butterknife.ButterKnife.Injector;

public class BroadcastFragment$$ViewInjector<T extends ice.caster.android.fragment.BroadcastFragment> implements Injector<T> {
  @Override public void inject(final Finder finder, final T target, Object source) {
    View view;
    view = finder.findRequiredView(source, 2131230859, "field 'start'");
    target.start = finder.castView(view, 2131230859, "field 'start'");
    view = finder.findRequiredView(source, 2131230821, "field 'progressBar'");
    target.progressBar = finder.castView(view, 2131230821, "field 'progressBar'");
    view = finder.findRequiredView(source, 2131230862, "field 'stop'");
    target.stop = finder.castView(view, 2131230862, "field 'stop'");
    view = finder.findRequiredView(source, 2131230860, "field 'status'");
    target.status = finder.castView(view, 2131230860, "field 'status'");
    view = finder.findRequiredView(source, 2131230758, "field 'configuration'");
    target.configuration = finder.castView(view, 2131230758, "field 'configuration'");
    view = finder.findRequiredView(source, 2131230814, "field 'linearLayout'");
    target.linearLayout = finder.castView(view, 2131230814, "field 'linearLayout'");
  }

  @Override public void reset(T target) {
    target.start = null;
    target.progressBar = null;
    target.stop = null;
    target.status = null;
    target.configuration = null;
    target.linearLayout = null;
  }
}
