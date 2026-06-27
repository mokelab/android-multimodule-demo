package com.mokelab.demo.multimodule.screen

import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import com.mokelab.demo.multimodule.repository.Data691RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data692RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data693RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data694RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data695RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data696RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data697RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data698RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data699RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data700RepositoryImpl 

import javax.inject.Inject

@HiltViewModel
class Screen070ViewModel @Inject constructor(
    private val repo1: Data691RepositoryImpl,
    private val repo2: Data692RepositoryImpl,
    private val repo3: Data693RepositoryImpl,
    private val repo4: Data694RepositoryImpl,
    private val repo5: Data695RepositoryImpl,
    private val repo6: Data696RepositoryImpl,
    private val repo7: Data697RepositoryImpl,
    private val repo8: Data698RepositoryImpl,
    private val repo9: Data699RepositoryImpl,
    private val repo10: Data700RepositoryImpl,

): ViewModel() {
}
