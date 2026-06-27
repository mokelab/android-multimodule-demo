package com.mokelab.demo.multimodule.screen

import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import com.mokelab.demo.multimodule.repository.Data131RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data132RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data133RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data134RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data135RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data136RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data137RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data138RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data139RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data140RepositoryImpl 

import javax.inject.Inject

@HiltViewModel
class Screen014ViewModel @Inject constructor(
    private val repo1: Data131RepositoryImpl,
    private val repo2: Data132RepositoryImpl,
    private val repo3: Data133RepositoryImpl,
    private val repo4: Data134RepositoryImpl,
    private val repo5: Data135RepositoryImpl,
    private val repo6: Data136RepositoryImpl,
    private val repo7: Data137RepositoryImpl,
    private val repo8: Data138RepositoryImpl,
    private val repo9: Data139RepositoryImpl,
    private val repo10: Data140RepositoryImpl,

): ViewModel() {
}
