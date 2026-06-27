package com.mokelab.demo.multimodule.screen

import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import com.mokelab.demo.multimodule.repository.Data601RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data602RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data603RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data604RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data605RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data606RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data607RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data608RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data609RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data610RepositoryImpl 

import javax.inject.Inject

@HiltViewModel
class Screen061ViewModel @Inject constructor(
    private val repo1: Data601RepositoryImpl,
    private val repo2: Data602RepositoryImpl,
    private val repo3: Data603RepositoryImpl,
    private val repo4: Data604RepositoryImpl,
    private val repo5: Data605RepositoryImpl,
    private val repo6: Data606RepositoryImpl,
    private val repo7: Data607RepositoryImpl,
    private val repo8: Data608RepositoryImpl,
    private val repo9: Data609RepositoryImpl,
    private val repo10: Data610RepositoryImpl,

): ViewModel() {
}
