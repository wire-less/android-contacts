package ru.yandex.practicum.contacts.presentation.base;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.DiffUtil;

public class BaseListDiffCallback <T extends ListDiffInterface<T>> extends DiffUtil.ItemCallback<T>  {
    public boolean theSameAs (T t) {}
    public boolean areContentsTheSame(T t) {}
    public Object getChangePayload(T t) {}
}
