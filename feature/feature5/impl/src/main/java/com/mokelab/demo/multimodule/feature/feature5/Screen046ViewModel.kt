package com.mokelab.demo.multimodule.feature.feature5

import androidx.lifecycle.ViewModel
import com.mokelab.demo.multimodule.core.data.Data451Repository
import com.mokelab.demo.multimodule.core.data.Data452Repository
import com.mokelab.demo.multimodule.core.data.Data453Repository
import com.mokelab.demo.multimodule.core.data.Data454Repository
import com.mokelab.demo.multimodule.core.data.Data455Repository
import com.mokelab.demo.multimodule.core.data.Data456Repository
import com.mokelab.demo.multimodule.core.data.Data457Repository
import com.mokelab.demo.multimodule.core.data.Data458Repository
import com.mokelab.demo.multimodule.core.data.Data459Repository
import com.mokelab.demo.multimodule.core.data.Data460Repository
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class Screen046ViewModel @Inject constructor(
    private val repo1: Data451Repository,
    private val repo2: Data452Repository,
    private val repo3: Data453Repository,
    private val repo4: Data454Repository,
    private val repo5: Data455Repository,
    private val repo6: Data456Repository,
    private val repo7: Data457Repository,
    private val repo8: Data458Repository,
    private val repo9: Data459Repository,
    private val repo10: Data460Repository,

    ) : ViewModel() {
}
