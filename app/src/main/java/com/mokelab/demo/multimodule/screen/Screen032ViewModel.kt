package com.mokelab.demo.multimodule.screen

import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import com.mokelab.demo.multimodule.repository.Data311RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data312RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data313RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data314RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data315RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data316RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data317RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data318RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data319RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data320RepositoryImpl 

import javax.inject.Inject

@HiltViewModel
class Screen032ViewModel @Inject constructor(
    private val repo1: Data311RepositoryImpl,
    private val repo2: Data312RepositoryImpl,
    private val repo3: Data313RepositoryImpl,
    private val repo4: Data314RepositoryImpl,
    private val repo5: Data315RepositoryImpl,
    private val repo6: Data316RepositoryImpl,
    private val repo7: Data317RepositoryImpl,
    private val repo8: Data318RepositoryImpl,
    private val repo9: Data319RepositoryImpl,
    private val repo10: Data320RepositoryImpl,

): ViewModel() {
}
