package com.mokelab.demo.multimodule.screen

import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import com.mokelab.demo.multimodule.repository.Data081RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data082RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data083RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data084RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data085RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data086RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data087RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data088RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data089RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data090RepositoryImpl 

import javax.inject.Inject

@HiltViewModel
class Screen009ViewModel @Inject constructor(
    private val repo1: Data081RepositoryImpl,
    private val repo2: Data082RepositoryImpl,
    private val repo3: Data083RepositoryImpl,
    private val repo4: Data084RepositoryImpl,
    private val repo5: Data085RepositoryImpl,
    private val repo6: Data086RepositoryImpl,
    private val repo7: Data087RepositoryImpl,
    private val repo8: Data088RepositoryImpl,
    private val repo9: Data089RepositoryImpl,
    private val repo10: Data090RepositoryImpl,

): ViewModel() {
}
