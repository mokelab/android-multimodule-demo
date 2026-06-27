package com.mokelab.demo.multimodule.screen

import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import com.mokelab.demo.multimodule.repository.Data531RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data532RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data533RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data534RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data535RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data536RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data537RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data538RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data539RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data540RepositoryImpl 

import javax.inject.Inject

@HiltViewModel
class Screen054ViewModel @Inject constructor(
    private val repo1: Data531RepositoryImpl,
    private val repo2: Data532RepositoryImpl,
    private val repo3: Data533RepositoryImpl,
    private val repo4: Data534RepositoryImpl,
    private val repo5: Data535RepositoryImpl,
    private val repo6: Data536RepositoryImpl,
    private val repo7: Data537RepositoryImpl,
    private val repo8: Data538RepositoryImpl,
    private val repo9: Data539RepositoryImpl,
    private val repo10: Data540RepositoryImpl,

): ViewModel() {
}
