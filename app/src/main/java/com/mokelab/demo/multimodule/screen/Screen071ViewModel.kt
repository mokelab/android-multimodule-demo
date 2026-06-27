package com.mokelab.demo.multimodule.screen

import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import com.mokelab.demo.multimodule.repository.Data701RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data702RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data703RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data704RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data705RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data706RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data707RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data708RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data709RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data710RepositoryImpl 

import javax.inject.Inject

@HiltViewModel
class Screen071ViewModel @Inject constructor(
    private val repo1: Data701RepositoryImpl,
    private val repo2: Data702RepositoryImpl,
    private val repo3: Data703RepositoryImpl,
    private val repo4: Data704RepositoryImpl,
    private val repo5: Data705RepositoryImpl,
    private val repo6: Data706RepositoryImpl,
    private val repo7: Data707RepositoryImpl,
    private val repo8: Data708RepositoryImpl,
    private val repo9: Data709RepositoryImpl,
    private val repo10: Data710RepositoryImpl,

): ViewModel() {
}
