package br.com.lucasalbuquerque.mvvmsample.viewmodel.binding;

import android.databinding.BindingAdapter;
import android.support.v7.widget.RecyclerView;

import br.com.lucasalbuquerque.mvvmsample.viewmodel.RecyclerViewViewModel;

public class ViewModelBindings {

    @BindingAdapter("recyclerViewViewModel")
    public static void setRecyclerViewViewModel(RecyclerView recyclerView, RecyclerViewViewModel viewModel) {
        viewModel.setupRecyclerView(recyclerView);
    }
}