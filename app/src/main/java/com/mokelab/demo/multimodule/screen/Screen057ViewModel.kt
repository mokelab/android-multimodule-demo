package com.mokelab.demo.multimodule.screen

import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import com.mokelab.demo.multimodule.repository.Data561RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data562RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data563RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data564RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data565RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data566RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data567RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data568RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data569RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data570RepositoryImpl 

import javax.inject.Inject

@HiltViewModel
class Screen057ViewModel @Inject constructor(
    private val repo1: Data561RepositoryImpl,
    private val repo2: Data562RepositoryImpl,
    private val repo3: Data563RepositoryImpl,
    private val repo4: Data564RepositoryImpl,
    private val repo5: Data565RepositoryImpl,
    private val repo6: Data566RepositoryImpl,
    private val repo7: Data567RepositoryImpl,
    private val repo8: Data568RepositoryImpl,
    private val repo9: Data569RepositoryImpl,
    private val repo10: Data570RepositoryImpl,

): ViewModel() {
}
