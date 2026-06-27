package com.mokelab.demo.multimodule.screen

import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import com.mokelab.demo.multimodule.repository.Data171RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data172RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data173RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data174RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data175RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data176RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data177RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data178RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data179RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data180RepositoryImpl 

import javax.inject.Inject

@HiltViewModel
class Screen018ViewModel @Inject constructor(
    private val repo1: Data171RepositoryImpl,
    private val repo2: Data172RepositoryImpl,
    private val repo3: Data173RepositoryImpl,
    private val repo4: Data174RepositoryImpl,
    private val repo5: Data175RepositoryImpl,
    private val repo6: Data176RepositoryImpl,
    private val repo7: Data177RepositoryImpl,
    private val repo8: Data178RepositoryImpl,
    private val repo9: Data179RepositoryImpl,
    private val repo10: Data180RepositoryImpl,

): ViewModel() {
}
