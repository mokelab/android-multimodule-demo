package com.mokelab.demo.multimodule.screen

import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import com.mokelab.demo.multimodule.repository.Data721RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data722RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data723RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data724RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data725RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data726RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data727RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data728RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data729RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data730RepositoryImpl 

import javax.inject.Inject

@HiltViewModel
class Screen073ViewModel @Inject constructor(
    private val repo1: Data721RepositoryImpl,
    private val repo2: Data722RepositoryImpl,
    private val repo3: Data723RepositoryImpl,
    private val repo4: Data724RepositoryImpl,
    private val repo5: Data725RepositoryImpl,
    private val repo6: Data726RepositoryImpl,
    private val repo7: Data727RepositoryImpl,
    private val repo8: Data728RepositoryImpl,
    private val repo9: Data729RepositoryImpl,
    private val repo10: Data730RepositoryImpl,

): ViewModel() {
}
