package com.mokelab.demo.multimodule.screen

import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import com.mokelab.demo.multimodule.repository.Data281RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data282RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data283RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data284RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data285RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data286RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data287RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data288RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data289RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data290RepositoryImpl 

import javax.inject.Inject

@HiltViewModel
class Screen029ViewModel @Inject constructor(
    private val repo1: Data281RepositoryImpl,
    private val repo2: Data282RepositoryImpl,
    private val repo3: Data283RepositoryImpl,
    private val repo4: Data284RepositoryImpl,
    private val repo5: Data285RepositoryImpl,
    private val repo6: Data286RepositoryImpl,
    private val repo7: Data287RepositoryImpl,
    private val repo8: Data288RepositoryImpl,
    private val repo9: Data289RepositoryImpl,
    private val repo10: Data290RepositoryImpl,

): ViewModel() {
}
