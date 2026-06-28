package com.mokelab.demo.multimodule.feature.feature6

import androidx.lifecycle.ViewModel
import com.mokelab.demo.multimodule.core.data.Data591Repository
import com.mokelab.demo.multimodule.core.data.Data592Repository
import com.mokelab.demo.multimodule.core.data.Data593Repository
import com.mokelab.demo.multimodule.core.data.Data594Repository
import com.mokelab.demo.multimodule.core.data.Data595Repository
import com.mokelab.demo.multimodule.core.data.Data596Repository
import com.mokelab.demo.multimodule.core.data.Data597Repository
import com.mokelab.demo.multimodule.core.data.Data598Repository
import com.mokelab.demo.multimodule.core.data.Data599Repository
import com.mokelab.demo.multimodule.core.data.Data600Repository
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class Screen060ViewModel @Inject constructor(
    private val repo1: Data591Repository,
    private val repo2: Data592Repository,
    private val repo3: Data593Repository,
    private val repo4: Data594Repository,
    private val repo5: Data595Repository,
    private val repo6: Data596Repository,
    private val repo7: Data597Repository,
    private val repo8: Data598Repository,
    private val repo9: Data599Repository,
    private val repo10: Data600Repository,

    ) : ViewModel() {
}
