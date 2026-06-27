package com.mokelab.demo.multimodule.screen

import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import com.mokelab.demo.multimodule.repository.Data381RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data382RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data383RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data384RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data385RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data386RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data387RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data388RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data389RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data390RepositoryImpl 

import javax.inject.Inject

@HiltViewModel
class Screen039ViewModel @Inject constructor(
    private val repo1: Data381RepositoryImpl,
    private val repo2: Data382RepositoryImpl,
    private val repo3: Data383RepositoryImpl,
    private val repo4: Data384RepositoryImpl,
    private val repo5: Data385RepositoryImpl,
    private val repo6: Data386RepositoryImpl,
    private val repo7: Data387RepositoryImpl,
    private val repo8: Data388RepositoryImpl,
    private val repo9: Data389RepositoryImpl,
    private val repo10: Data390RepositoryImpl,

): ViewModel() {
}
