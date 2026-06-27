package com.mokelab.demo.multimodule.screen

import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import com.mokelab.demo.multimodule.repository.Data191RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data192RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data193RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data194RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data195RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data196RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data197RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data198RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data199RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data200RepositoryImpl 

import javax.inject.Inject

@HiltViewModel
class Screen020ViewModel @Inject constructor(
    private val repo1: Data191RepositoryImpl,
    private val repo2: Data192RepositoryImpl,
    private val repo3: Data193RepositoryImpl,
    private val repo4: Data194RepositoryImpl,
    private val repo5: Data195RepositoryImpl,
    private val repo6: Data196RepositoryImpl,
    private val repo7: Data197RepositoryImpl,
    private val repo8: Data198RepositoryImpl,
    private val repo9: Data199RepositoryImpl,
    private val repo10: Data200RepositoryImpl,

): ViewModel() {
}
