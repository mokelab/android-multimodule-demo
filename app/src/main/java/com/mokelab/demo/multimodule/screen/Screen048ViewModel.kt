package com.mokelab.demo.multimodule.screen

import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import com.mokelab.demo.multimodule.repository.Data471RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data472RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data473RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data474RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data475RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data476RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data477RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data478RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data479RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data480RepositoryImpl 

import javax.inject.Inject

@HiltViewModel
class Screen048ViewModel @Inject constructor(
    private val repo1: Data471RepositoryImpl,
    private val repo2: Data472RepositoryImpl,
    private val repo3: Data473RepositoryImpl,
    private val repo4: Data474RepositoryImpl,
    private val repo5: Data475RepositoryImpl,
    private val repo6: Data476RepositoryImpl,
    private val repo7: Data477RepositoryImpl,
    private val repo8: Data478RepositoryImpl,
    private val repo9: Data479RepositoryImpl,
    private val repo10: Data480RepositoryImpl,

): ViewModel() {
}
