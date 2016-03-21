package br.com.lucasalbuquerque.mvvmsample.view.adapter;

import android.databinding.ViewDataBinding;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import br.com.lucasalbuquerque.domain.model.User;
import br.com.lucasalbuquerque.mvvmsample.R;
import br.com.lucasalbuquerque.mvvmsample.databinding.ItemUserBinding;
import br.com.lucasalbuquerque.mvvmsample.viewmodel.UserItemViewModel;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class UserItemsAdapter extends RecyclerViewAdapter<User, UserItemViewModel> {
    @Override
    public ItemViewHolder<User, UserItemViewModel> onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_user, parent, false);

        UserItemViewModel viewModel = new UserItemViewModel();

        ItemUserBinding binding = ItemUserBinding.bind(itemView);
        binding.setViewModel(viewModel);

        return new UserViewHolder(itemView, binding, viewModel);
    }

    static class UserViewHolder extends ItemViewHolder<User, UserItemViewModel> {

        public UserViewHolder(View itemView, ViewDataBinding binding, UserItemViewModel viewModel) {
            super(itemView, binding, viewModel);
            ButterKnife.bind(this, itemView);
        }
/*
        @OnClick(R.id.versionItem)
        void onClickVersionItem() {
            viewModel.onClick();
        }*/
    }
}
